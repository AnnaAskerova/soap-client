package com.example.service.client;

import com.example.service.client.model.ItemModel;
import com.example.service.client.repository.ItemRepository;
import com.example.service.service.GetPatch;
import com.example.service.service.GetPatchResponse;
import com.example.service.service.UpdateService;
import com.example.service.service.UpdateServiceImplService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerUpdate {
    private final ItemRepository repository;

    public SchedulerUpdate(ItemRepository repository) {
        this.repository = repository;
    }

    @Scheduled(cron = "0 0/1 * * * *")
    public void updateDatabase() {
        UpdateServiceImplService service = new UpdateServiceImplService();
        UpdateService updateService = service.getUpdateServiceImplPort();
        GetPatchResponse.Return response = updateService.getPatch(new GetPatch()).getReturn();
        response.getToAdd().forEach(item -> repository.save(new ItemModel(item.getId(), item.getName())));
        response.getToDelete().forEach(id -> {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        });
        repository.findAll().forEach(System.out::println);
    }
}

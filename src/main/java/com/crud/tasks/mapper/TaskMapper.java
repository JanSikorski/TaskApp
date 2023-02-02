package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskMapper {

    public Task mapToTask(final TaskDto taskDto) {

        if (taskDto == null){
            return null;
        }

        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getContent()
        );
    }

    public TaskDto mapToTaskDto(final Task task) {

        if (task == null){
            return null;
        }

        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getContent()
        );
    }

    public List<TaskDto> mapToTaskDtoList(final List<Task> taskList) {

        if (taskList == null) {
            return null;
        }

        return taskList.stream()
                .map(this::mapToTaskDto)
                .toList();
    }

}
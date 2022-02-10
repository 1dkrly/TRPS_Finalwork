package com.example.finalwork.actions;

import com.example.finalwork.model.Module;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ModuleAction extends CrudRepository<Module, Long> {
    List<Module> findModulesByCourseId(Long Id);
}

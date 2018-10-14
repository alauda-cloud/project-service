package io.alauda.project.repository;

import io.alauda.project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByIdIn(Collection<Long> ids);
}

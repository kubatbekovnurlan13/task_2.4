package kg.kubatbekov.task_23.service;

import kg.kubatbekov.task_23.dao.GroupDAOImplementation;
import kg.kubatbekov.task_23.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupDAOImplementation groupDAOImplementation;

    @Autowired
    public GroupService(GroupDAOImplementation groupDAOImplementation) {
        this.groupDAOImplementation = groupDAOImplementation;
    }

    public void save(Group group) {
        groupDAOImplementation.save(group);
    }

    public boolean update(Group group) {
        return groupDAOImplementation.update(group);
    }

    public Group getByName(String name) {
        return groupDAOImplementation.getByName(name);
    }

    public List<Group> getAll() {
        return groupDAOImplementation.getAll();
    }

    public boolean deleteById(int group_id) {
        return groupDAOImplementation.deleteById(group_id);
    }

    public List<Group> findLessOrEqualStudentAccount(int count) {
        return groupDAOImplementation.findLessOrEqualStudentAccount(count);
    }
}

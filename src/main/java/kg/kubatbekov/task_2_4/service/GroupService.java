package kg.kubatbekov.task_2_4.service;

import kg.kubatbekov.task_2_4.dao.GroupDAO;
import kg.kubatbekov.task_2_4.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupDAO groupDAO;

    @Autowired
    public GroupService(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    public boolean save(Group group) {
        return groupDAO.save(group);
    }

    public Group getByName(String name) {
        return groupDAO.getByName(name);
    }

    public List<Group> findLessOrEqualStudentCount(int count) {
        return groupDAO.findLessOrEqualStudentCount(count);
    }

    public List<Group> getAll() {
        return groupDAO.getAll();
    }

    public boolean update(Group group) {
        return groupDAO.update(group);
    }

    public boolean deleteById(int group_id) {
        return groupDAO.deleteById(group_id);
    }
}

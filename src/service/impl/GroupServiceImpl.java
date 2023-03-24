package service.impl;

import db.DataBase;
import model.Group;
import service.GroupService;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupServiceImpl implements GroupService {
    DataBase dataBase=new DataBase();
    @Override
    public String addNewGroup(Group group) {
         dataBase.getGroup().add(group);
         return "succes";
    }

    @Override
    public String getGroupById(int id) {
        dataBase.getGroup().stream().filter(group -> group.equals(id));
        return "ok";
    }

    @Override
    public List<Group> getAllGroups() {
        return  dataBase.getGroup().stream().toList();


    }

    @Override
    public String updateGroupName(int id, String groupName) {
        dataBase.getGroup().stream().map(group -> groupName);
        return groupName;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return    dataBase.getGroup().stream().sorted().collect(Collectors.toList());

    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return   dataBase.getGroup().stream().sorted().collect(Collectors.toList());

    }

    @Override
    public void deleteGroupById(int id) {

    }
}

package com.eisgroup.cb.dao;

import com.eisgroup.cb.model.Admin;

import java.util.List;

/**
 * Created by Maverick on 23.05.2017.
 */
public interface AdminDAO {
    List<Admin> getAdminByLogin(Admin admin);
}
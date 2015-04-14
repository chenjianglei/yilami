package com.yilami.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yilami.dao.RolesDao;
import com.yilami.entity.Roles;
import com.yilami.entity.UserRoles;
import com.yilami.service.RolesService;
import com.yilami.util.PageView;

@Transactional
@Service("rolesService")
public class RolesServiceImpl implements RolesService {
	@Autowired
	private RolesDao rolesDao;

	public PageView query(PageView pageView, Roles roles) {
		List<Roles> list = rolesDao.query(pageView, roles);
		pageView.setRecords(list);
		return pageView;
	}

	public void add(Roles roles) {
		rolesDao.add(roles);
		
	}

	public void delete(String id) {
		rolesDao.delete(id);
		
	}

	public Roles getById(String id) {
		return rolesDao.getById(id);
	}

	public void modify(Roles roles) {
		rolesDao.modify(roles);
	}

	public List<Roles> findAll() {
		return rolesDao.findAll();
	}

	public void saveUserRole(UserRoles userRoles) {
		rolesDao.deleteUserRole(userRoles.getUserId().toString());
		rolesDao.saveUserRole(userRoles);
	}

}

package com.hg.systemGd.issm.Service;

import com.hg.systemGd.issm.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected Sys_GdRepository sys_gdRepository;

    @Autowired
    protected MediaRepository mediaRepository;

    @Autowired
    protected ActionLogRepository actionLogRepository;

    @Autowired
    protected Gd_statusRepository gdStatusRepository;

    @Autowired
    protected KownledgeRepository kownledgeRepository;

    @Autowired
    protected MenuRepository menuRepository;




}

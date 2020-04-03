package com.hg.systemGd.issm.Service;

import com.hg.systemGd.issm.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService extends BaseService {

    @Transactional(rollbackFor = Exception.class,transactionManager = "transactionManagerPrimary")
    public User saveUser()throws Exception{
        User person1=new User();
        Gd_status gd_status=new Gd_status();
        gd_status.setStatus("00000");
        gd_status.setStatusName("已创建");

        Gd_status gd_status1=new Gd_status();
        gd_status1.setStatus("00001");
        gd_status1.setStatusName("已派发");

        Gd_status gd_status2=new Gd_status();
        gd_status2.setStatus("00002");
        gd_status2.setStatusName("已处理");

        Gd_status gd_status3=new Gd_status();
        gd_status3.setStatus("00003");
        gd_status3.setStatusName("已入库");

        super.gdStatusRepository.save(gd_status);
        super.gdStatusRepository.save(gd_status1);
        super.gdStatusRepository.save(gd_status2);
        super.gdStatusRepository.save(gd_status3);

        ActionLog actionLog=new ActionLog();

        Kownledge kownledge=new Kownledge();
        Media media=new Media();
        /**
         * 首页菜单
         */
        Meum meum=new Meum();
        meum.setName("创建工单");
        meum.setRedirectPath("../gd_info/gd_info");
        meum.setIcon("");

        Meum meum2=new Meum();
        meum2.setName("待办工单");
        meum2.setRedirectPath("../ready/ready");
        meum2.setIcon("");

        Meum meum3=new Meum();
        meum3.setName("已办工单");
        meum3.setRedirectPath("../onReady/onReady");
        meum3.setIcon("");

        Meum meum4=new Meum();
        meum4.setName("用户管理");
        meum4.setRedirectPath("../userCenter/userCenter");
        meum4.setIcon("");

        Meum meum5=new Meum();
        meum5.setName("知识库");
        meum5.setRedirectPath("../kownledeInfo/kownledeInfo");
        meum5.setIcon("");

        super.menuRepository.save(meum);
        super.menuRepository.save(meum2);
        super.menuRepository.save(meum3);
        super.menuRepository.save(meum4);
        super.menuRepository.save(meum5);

        Sys_gd sys_gd=new Sys_gd();
        super.userRepository.save(person1);
        super.actionLogRepository.save(actionLog);

        super.mediaRepository.save(media);
        super.sys_gdRepository.save(sys_gd);
        super.kownledgeRepository.save(kownledge);

        return person1;
    }
}

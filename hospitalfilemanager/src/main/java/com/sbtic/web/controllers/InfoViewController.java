package com.sbtic.web.controllers;

import com.sbtic.db.access.DAO;
import com.sbtic.db.data.patient.UserRecord;
import com.sbtic.web.form.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InfoViewController
{
    private DAO dao;

    @Autowired
    public void setDao(DAO dao)
    {
        this.dao = dao;
    }

    @RequestMapping("/info")
    public String showInfoPage(Model model, LoginInfo loginInfo)
    {
        //TODO take filters into account in JSP!!!
        System.out.println("showing login Info for details from " + loginInfo);
        UserRecord record = dao.getRecord(loginInfo.getPublicKey());
        if(record != null)
        {
            model.addAttribute("mode", loginInfo.getLoginType());
            model.addAttribute("record", record);
            return "info";
        }
        else//record null: not found
        {
            return "notFound";
        }
    }

    @RequestMapping("/clients")
    public String showClientsPage(Model model, LoginInfo loginInfo)
    {
        System.out.println("showing login Info for details from " + loginInfo);
        List<UserRecord> userRecords = dao.getDoctor(loginInfo.getPublicKey());
        if(userRecords != null)
        {
            model.addAttribute("userRecords", userRecords);
            model.addAttribute("mode", loginInfo.getLoginType());
            return "clients";
        }
        else//record null: not found
        {
            return "notFoundDoctor";
        }
    }
}

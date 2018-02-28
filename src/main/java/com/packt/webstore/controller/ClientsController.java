package com.packt.webstore.controller;

import com.packt.webstore.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientsController {
    private ClientsService clientsService;

    @Autowired
    public ClientsController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @RequestMapping("/customers")
    public String list(Model model){
        model.addAttribute("customers",clientsService.getAllCustomers());
        return "customers";
    }
}

package com.example.hotelbooking2.controller;

import com.example.hotelbooking2.entity.View;
import com.example.hotelbooking2.service.ViewServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ViewController {

    private ViewServiceImpl viewService;
    public ViewController(ViewServiceImpl theViewService){
        viewService=theViewService;
    }

    /// get all views
    @GetMapping("/views")
    public List<View> findAll(){
        return viewService.findAll();
    }

    /// add a view
    @PostMapping("/view/add")
    public View addView(@RequestBody View theView){
        theView.setViewId(0);
        viewService.save(theView);
        return theView;
    }
}

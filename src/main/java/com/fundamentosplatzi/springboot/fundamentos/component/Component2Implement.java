package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Component2Implement  implements  ComponentDependecy{


    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el componente2");
    }
}

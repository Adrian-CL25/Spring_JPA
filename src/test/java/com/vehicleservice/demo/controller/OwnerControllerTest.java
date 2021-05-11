package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.service.OwnerService;
import org.assertj.core.api.Assertions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OwnerControllerTest {

    @InjectMocks
    private OwnerController ownerController;

    @Mock
    private OwnerService ownerService;

    @Test
    public void getOwnerByIdTest (){
        OwnerEntity ownerEntity = new OwnerEntity();
        Mockito.when(ownerService.findOwnerById(1)).thenReturn(ownerEntity);
        OwnerEntity ownerById = ownerController.getOwnerById(1);
        Assertions.assertThat(ownerById).isSameAs(ownerEntity);
    }


}

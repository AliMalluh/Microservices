package com.example.deliverymanagmentsystem.model.address;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @NotNull
    private long regionId;
    @NotNull
    private String regionName;
}

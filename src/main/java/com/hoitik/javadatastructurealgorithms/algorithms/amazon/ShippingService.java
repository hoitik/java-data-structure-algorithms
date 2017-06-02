package com.hoitik.javadatastructurealgorithms.algorithms.amazon;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShippingService {

    public boolean canShipToAllCities(List<Set<String>> warehouses, List<String> cities, int maxWarehousesToUse) {
        warehouses.stream().filter(warehouse -> warehouse.stream().anyMatch(cities::contains)).collect(Collectors.toList());
        // TODO: warehouses could still have duplicate cities coverage, might fail the maxWarehousesToUse check
        return false;
    }
}

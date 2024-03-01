package SOLID.products.Drinks;

import SOLID.products.Product;

public interface Drink extends Product {
    double getLiters();
    double getDensity();
}

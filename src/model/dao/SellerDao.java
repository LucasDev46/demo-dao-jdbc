package model.dao;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void DeleteById(Seller obj);
    Seller findById(Seller id);
    List<Seller> findAll();
}

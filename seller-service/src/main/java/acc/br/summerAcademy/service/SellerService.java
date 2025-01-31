package acc.br.summerAcademy.service;

import acc.br.summerAcademy.model.Seller;
import acc.br.summerAcademy.repository.SellerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public Seller create(Seller seller) {
        return sellerRepository.save(seller);
    }

    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }

    public Seller deleteSeller(Long id) {
        Seller seller = sellerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Seller não encontrado"));
        sellerRepository.delete(seller);
        return seller;
    }
}

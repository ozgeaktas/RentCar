package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;

public interface BrandService {
	List<GetAllBrandResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);

}

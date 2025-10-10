package CaseStudy.src.com.tnsif.application;



import CaseStudy.src.com.tnsif.framework.NormalAcc;
import CaseStudy.src.com.tnsif.framework.PrimeAcc;
import CaseStudy.src.com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc prime = new PrimeAcc( accNo,  accNm,  charges,  isPrime);
		return prime;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		NormalAcc normal = new NormalAcc(accNo,  accNm,  charges,deliveryCharge);
		return normal;
	}

}

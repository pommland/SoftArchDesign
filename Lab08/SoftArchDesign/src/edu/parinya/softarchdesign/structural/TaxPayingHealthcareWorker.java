package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker  extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorkerDecorator worker) {
        super(worker);
        System.out.println("TaxPaying");
    }


    @Override
    public double getPrice() {
        // Add 10% on top
        return 1.1f * super.getPrice();
    }
}

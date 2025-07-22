public class LogisticService {
    public int calculateAllowance(int collectionRate) {
        if(collectionRate > 0 && collectionRate < 50) {
            return collectionRate * 160 + 5000;
        }else if(collectionRate >= 50 && collectionRate < 60){
            return collectionRate * 200 + 5000;
        }else if(collectionRate >= 60 && collectionRate < 70){
            return collectionRate * 250 + 5000;
        }else if(collectionRate >= 70 && collectionRate <= 100){
            return collectionRate * 500 + 5000;
        }else {
            throw new IllegalArgumentException("Invalid collection rate");
        }
    }
}
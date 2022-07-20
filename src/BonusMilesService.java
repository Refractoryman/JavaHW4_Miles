public class BonusMilesService {

    public int calculate(int price) {
            int bonusCounting = 20;
            int miles = price / bonusCounting;
            return miles;
    }
}

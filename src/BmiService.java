public class BmiService {
    float weight;
    float growth;
    float index () {
        return weight/(growth * growth);
    }
}

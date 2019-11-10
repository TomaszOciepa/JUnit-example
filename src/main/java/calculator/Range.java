package calculator;

public class Range {

    private Long lowerBound;
    private Long upperBound;

    public Range(Long lowerBound, Long upperBound) {

        if (lowerBound > upperBound){
            throw new IllegalArgumentException("lowerBound is bigger than upperBound");
        }

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Boolean isInRange(long number){
        return number >= lowerBound && number <= upperBound;
    }

}

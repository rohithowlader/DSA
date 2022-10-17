import java.util.*;


class kids_with_the_greatest_number_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            int c=candies[i] + extraCandies;
            if ( c >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {

        kids_with_the_greatest_number_of_candies obj = new kids_with_the_greatest_number_of_candies();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> arr = obj.kidsWithCandies(candies, extraCandies);
        for (boolean i : arr)
            System.out.println(i);
        // "he bought 2 pencils, 3 erasers, and 1 pencil-sharpener."
    }
}

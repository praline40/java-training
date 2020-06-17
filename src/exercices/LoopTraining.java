public class LoopTraining {

    /**
     * @param values, eg: {1, 2, 3}
     * @return the sum of the values, eg: 6
     */
    public static int sum(int[] values) {
        int n=0;
        for (int v : values) {
            n+=v;
        }
        return n;
    }

    /**
     * @param values, eg: {"a", "b", "c"}
     * @return the concatenation of all values values, eg: "abc"
     */
    public static String concat(String[] values) {
        String ss="";
        for (String s : values) {
            ss+=s;
        }
        return ss;
    }

    /**
     * @param values, eg: {1, 3, 5}
     * @return if the array contains an even value, eg: false
     */
    public static boolean hasEven(int[] values) {
        for (int v : values) {
            if (v%2==0){
                return true;
            }
        }
        return false;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param search, eg: 2
     * @return the index of the searched value or -1 if the value isn't present, eg: 1
     */
    public static int indexOf(int[] values, int search) {
        for(int i=0; i<values.length; i++){
            if (values[i]==search){
                return i;
                 
            }
        }
        return -1;
    }

    /**
     * @param values, eg: {1, 2, 3, 1, 2}
     * @param search, eg: 2
     * @return how many times the searched value occurred, eg: 2
     */
    public static int count(int[] values, int search) {
        int n=0;
        for(int i=0; i<values.length; i++){
            if (values[i]==search){
                n++;
            }
        }
        return n;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param increment, eg: 2
     * @return add the increment to each value of the array, eg: {3, 4, 5}
     */
    public static int[] incrementEach(int[] values, int increment) {
        for (int i=0; i<values.length; i++) {
            values[i]+=increment;            
        }
        return values;
    }
}

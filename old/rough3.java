public static void FrequencyQueries(int[] arr, int[] queries) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        int num = arr[i];
        if (hm.containsKey(num)) {
            int temp = hm.get(num);
            hm.put(num, temp + 1);
        } else {
            hm.put(num, 1);
        }
    }

    int m = queries.length;
    for (int i = 0; i < m; i++) {
        int num = queries[i];
        if (hm.containsKey(num)) {
            System.out.println(hm.get(num));
        } else {
            System.out.println(0);
        }
    }
}

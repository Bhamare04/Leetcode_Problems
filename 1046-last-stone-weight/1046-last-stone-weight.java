class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() > 1) {

            Collections.sort(list);

            int l1 = list.get(list.size() - 1);
            int l2 = list.get(list.size() - 2);

            list.remove(list.size() - 1);
            list.remove(list.size() - 1);

            if (l1 != l2) {
                list.add(l1 - l2);
            }
        }

        if (list.isEmpty())
            return 0;

        return list.get(0);
    }
}
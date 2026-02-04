class Solution {

    class Tuple {
        String word;
        int level;

        Tuple(String word, int level) {
            this.word = word;
            this.level = level;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(beginWord, 1));
        set.remove(beginWord);

        while (!q.isEmpty()) {
            Tuple cur = q.poll();
            String word = cur.word;
            int level = cur.level;

            if (word.equals(endWord)) {
                return level;
            }

            char[] arr = word.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                char originalChar = arr[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    arr[i] = ch;
                    String nextWord = new String(arr);

                    if (set.contains(nextWord)) {
                        q.offer(new Tuple(nextWord, level + 1));
                        set.remove(nextWord);
                    }
                }

                arr[i] = originalChar;
            }
        }

        return 0;
    }
}

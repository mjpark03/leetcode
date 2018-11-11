class Solution {
    private class Log implements Comparable<Log> {
        String id;
        String content;
        
        public Log(String id, String content) {
            this.id = id;
            this.content = content;
        }
        
        @Override
        public int compareTo(Log otherLog) { return this.content.compareTo(otherLog.content); }
    }
    
    public String[] reorderLogFiles(String[] logs) {
        PriorityQueue<Log> letterQ = new PriorityQueue<>();
        Queue<String> digitQ = new LinkedList<>();
        
        String[] results = new String[logs.length];
        int index = 0;
        
        for (String log: logs) {
            int spaceIndex = log.indexOf(" ");
            String id = log.substring(0, spaceIndex);
            String content = log.substring(spaceIndex + 1);
            
            if ('a' <= content.charAt(0) && content.charAt(0) <= 'z') {
                Log letterLog = new Log(id, content);
                letterQ.add(letterLog);
            } else {
                digitQ.add(log);
            }
        }
        
        while (!letterQ.isEmpty()) {
            Log log = letterQ.poll();
            results[index++] = log.id + " " + log.content;
        }
        while (!digitQ.isEmpty())
            results[index++] = digitQ.poll();
        
        return results;
    }
}

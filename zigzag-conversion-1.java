class Solution {
    public String convert(String s, int numRows) {
        StringBuffer[] buffers = new StringBuffer[numRows];
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < numRows; i++)
            buffers[i] = new StringBuffer();
        
        int index = 0, size = s.length();
        while (index < size) {
            for (int bufferIdx = 0; bufferIdx < numRows && index < size; bufferIdx++)
                buffers[bufferIdx].append(chars[index++]);
            for (int bufferIdx = numRows - 2; bufferIdx > 0 && index < size; bufferIdx--)
                buffers[bufferIdx].append(chars[index++]);
        }
        
        String result = "";
        for (StringBuffer buffer: buffers)
            result += buffer.toString();
        
        return result;
    }
}

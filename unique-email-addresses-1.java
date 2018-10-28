
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        
        for (String email: emails) {
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];
            
            localName = localName.replaceAll(".", "");
            localName = localName.indexOf("+") > 0 ? localName.substring(0, localName.indexOf("@")) : localName;
            set.add(localName + "@" + domainName);
        }
        
        return set.size();
    }
}

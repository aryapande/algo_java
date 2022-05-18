//https://leetcode.com/problems/implement-trie-prefix-tree/

class TrieNode
{
    HashMap<Character,TrieNode> children;
    boolean last;
    TrieNode()
    {
        children = new HashMap<>();
        last = false;
    }
}
class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = this.root;
        char ch;
        for(int x=0;x<word.length();x++)
        {
            ch = word.charAt(x);
            if(curr.children.containsKey(ch)==false)
            {
                curr.children.put(ch,new TrieNode());
            }
            curr = curr.children.get(ch);
        }
        curr.last = true;
        
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = this.root;
        char ch;
        
        for(int x=0;x<word.length();x++)
        {
            ch = word.charAt(x);
            if(curr.children.containsKey(ch)==false)
            {
               
                return false;
            }
           
            curr = curr.children.get(ch);
        }
        
        return curr.last;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = this.root;
        char ch;
        for(int x=0;x<prefix.length();x++)
        {
            ch = prefix.charAt(x);
            if(curr.children.containsKey(ch)==false)
            {
                return false;
            }
            curr = curr.children.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

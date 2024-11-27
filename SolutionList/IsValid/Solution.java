package SolutionList.IsValid;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    Map<Character,Character> map = new HashMap<>();
    public boolean isValid(String s) {
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Deque<Character> stack  =new LinkedList<>();

        for(Character curr:s.toCharArray()){
            // right signal
            if(map.containsKey(curr)){
                if(!stack.isEmpty()){
                    if(map.get(curr)!=stack.peek()){
                        return false;
                    }else{
                        stack.poll();
                    }
                }else{
                    return false;
                }
            }else{
                //left signal
                stack.push(curr);
            }
        }


        return stack.isEmpty();
    }
}
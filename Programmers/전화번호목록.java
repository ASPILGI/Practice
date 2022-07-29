// 1. Sort/Loop을 사용한 solution
// 2중 Loop를 사용하면 시간 초과이기 때문에 sorting을 통하여 1중으로만 Loop하게 한다.

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phoneBook) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++)
            if (phoneBook[i + 1].startsWith(phoneBook[i]))
                return false;
        
        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }
}

// 2. Hash를 사용한 solution

import java.util.HashMap; 

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. HashMap을 만든다.
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<phone_book.length; i++)
            map.put(phone_book[i], 1);
        
        // 2. 모든 전화번호의 접두어가 HashMap에 있는지 확인한다.
        for(int i=0; i<phone_book.length; i++)
            for(int j=0; j<phone_book[i].length(); j++)
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
        
        // 3. 없어서 여기까지 왔다면 접두어가 없다는 것이다.
          
        return true;
    }
}

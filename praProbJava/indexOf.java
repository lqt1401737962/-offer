public int strStr(String source, String target) {
        if (source == null || target == null){
            return -1;
        }
//如果target或source有一个是空 就返回-1
        int i,j;
        for(i = 0;i < source.length()-target.length + 1;i++){ //i是第一位 一直遍历到source-target+1位
            for ( j = 0;j < taget.length(); j++）{
                    // j 从头遍历到尾
                if （source.charAt ( i + j )!= target.charAt(j)）{
                break ;
//如果source里第i+j位出现的字符不等于第j位出现在target里的字符， break  【如果不等于就继续循环，等于了就往下走】【下面开始比较】
                } //if 结束
            }//for j 结束
            if (j == target.length()) {
                return i;
// 如果j等于target的值，返回i
             }
//如果j等于taoget长度
        }// for i 结束
        return -1;
    }
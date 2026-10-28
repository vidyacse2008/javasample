class Summary {
    int passCount,skipCount,failCount;
    Summary(int passCount, int skipCount, int failCount){
        this.passCount = passCount;
        this.skipCount = skipCount;
        this.failCount = failCount;
    }

    public int getPassCount(){
        return this.passCount;
    }

    public int getFailCount(){
        return this.failCount;
    }

    public int getSkipCount(){
        return this.skipCount;
    }
}
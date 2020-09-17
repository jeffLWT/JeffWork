private void solve() {
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		// dp[n] = dp[n-1] + dp[n] -> n까지 연속된 수의 합
		// 음수만 아니라면 어떤 수도 연속으로 포함하면 된다.
		
		for(int i=1;i<=n;i++) {
			dp[i] = sc.nextInt();
		}
		
		int max = dp[1];
		
		for(int i=2;i<=n;i++) {
			
			if (dp[i-1] > 0 && dp[i] + dp[i-1] > 0) {
				dp[i] += dp[i-1];
			} 
			
			if (max < dp[i]) {
				max = dp[i];
			}
			
		}
		
		System.out.println(max);
		
	}
	
	public int max(int a, int b) {
		if (a > b) {
			return a; 
		} else {
			return b;
		}
	}

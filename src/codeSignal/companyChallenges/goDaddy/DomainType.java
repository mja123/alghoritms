package codeSignal.companyChallenges.goDaddy;

import java.util.Arrays;

public class DomainType {
    String[] solution(String[] domains) {
        String[] topLevelDomains = {"commercial", "organization", "network", "information"};
        String[] currentDomains = new String[domains.length];

        int i = 0;
        for (String domain : domains) {
            String currentDomain = domain.substring(domain.lastIndexOf(".") + 1);


            currentDomains[i] = Arrays.stream(topLevelDomains)
                    .filter(d -> d.startsWith(currentDomain))
                    .findFirst()
                    .get();
            i++;
        }
        return currentDomains;
    }

}

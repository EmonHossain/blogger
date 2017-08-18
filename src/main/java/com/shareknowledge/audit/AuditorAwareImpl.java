package com.shareknowledge.audit;

import org.springframework.boot.autoconfigure.security.AuthenticationManagerConfiguration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Component
public class AuditorAwareImpl implements AuditorAware{

    @Override
    public Integer getCurrentAuditor() {
        return 0;
    }
}

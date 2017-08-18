package com.shareknowledge.audit;

import org.springframework.boot.autoconfigure.security.AuthenticationManagerConfiguration;
import org.springframework.data.domain.AuditorAware;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
public class AuditImpl implements AuditorAware{
    //AuthenticationManagerConfiguration configuration =
    @Override
    public Integer getCurrentAuditor() {
        return 0;
    }
}

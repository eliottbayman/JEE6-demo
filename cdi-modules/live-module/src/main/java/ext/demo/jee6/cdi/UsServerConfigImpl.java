/**
 *
 */
package ext.demo.jee6.cdi;


import javax.inject.Named;

import ext.demo.jee6.api.Country;
import ext.demo.jee6.api.ServerConfiguration;

/**
 * @author  dstrauss
 */
@Named("us")
public class UsServerConfigImpl implements ServerConfiguration {

    /**
     */
    public UsServerConfigImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Country getDefaultCountry() {
        return Country.US;
    }
}
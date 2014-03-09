/**
 * Copyright (c) 2012-2013 Tomáš Polešovský
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package cz.topolik.liferay.fsrepo;

import com.liferay.portal.kernel.repository.DefaultLocalRepositoryImpl;

/**
 * @author Tomas Polesovsky
 */
public class FSRepoLocalRepositoryImpl extends DefaultLocalRepositoryImpl {

    public FSRepoLocalRepositoryImpl(FSRepo fsRepo) {
        super(fsRepo);
    }

}
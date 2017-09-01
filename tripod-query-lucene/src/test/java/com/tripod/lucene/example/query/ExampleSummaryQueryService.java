/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tripod.lucene.example.query;

import com.tripod.lucene.example.ExampleFieldSortTypeFactory;
import com.tripod.lucene.example.ExampleSummary;
import com.tripod.lucene.query.StandardLuceneQueryTransformer;
import com.tripod.lucene.query.service.LuceneQueryService;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.facet.FacetsConfig;
import org.apache.lucene.search.SearcherManager;

/**
 * LuceneQueryService implementation for ExampleSummary.
 *
 * @author bbende
 */
public class ExampleSummaryQueryService extends LuceneQueryService<ExampleSummary> {

    public ExampleSummaryQueryService(final SearcherManager searcherManager,
                                      final String defaultField,
                                      final Analyzer analyzer,
                                      final FacetsConfig facetsConfig) {
        super(searcherManager, analyzer,
                new StandardLuceneQueryTransformer(defaultField, analyzer, facetsConfig),
                new ExampleSummaryTransformer(),
                new ExampleFieldSortTypeFactory());
    }

}

import React from 'react';
import NewsList from './NewsList';

const ArticleDetails = ({story}) => {
    return (
        <li>

            <h3><a href={story.url}>{story.title}</a></h3>
            <p>Posted by: {story.by}</p>

        </li>
    )
}

export default ArticleDetails;
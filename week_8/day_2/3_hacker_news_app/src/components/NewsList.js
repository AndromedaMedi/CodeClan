import React from 'react';
import NewsArticle from '../components/NewsArticle';

const NewsList = ({newsArticles}) => {

    const storyTitles = newsArticles.map((story, index) => {
        return <NewsArticle key={index} story={story}>{story.title} | posted by: {story.by}</NewsArticle>
    })


    return (

        <ul>
            {storyTitles}
        </ul>
    )
}

export default NewsList;
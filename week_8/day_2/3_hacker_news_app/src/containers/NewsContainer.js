import React, {useState, useEffect} from "react";
import NewsList from "../components/NewsList";
import Filter from "../components/Filter";


const NewsContainer = () => {

    const [newsStories, setNewsStories] = useState([])
    const [newsArticles, setNewsArticles] = useState([]);
    const [allNewsArticles, setAllNewsArticles] = useState([]);

    // const [filterTerms, setFilterTerms] = useState([])


    useEffect(() => {
        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
        .then(res => res.json())
        .then((storyIds) => {setNewsStories(storyIds.slice(0, 50))})

    }, [])

    useEffect(() => {
        const articlePromises = newsStories.map((storyId) => {
        return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`).then(response => response.json());
        })

        Promise.all(articlePromises)
        .then(data => {
            setNewsArticles(data);
            setAllNewsArticles(data);
        })

    }, [newsStories])

    const filterNews = (searchInput) => {
        const filteredNewsArticles = allNewsArticles.filter((article) => {
            return article.title.includes(searchInput)
        })
        setNewsArticles(filteredNewsArticles)
    }



    return (
        <>
        <h2>Top 50 Hacker News Stories</h2>
        <Filter filterNews={filterNews}/>
        <NewsList newsArticles={newsArticles} />
        </>
    )
}

export default NewsContainer;
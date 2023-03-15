# README.md

Performance test using Jmeter on The Movie web

## Requirement
Create performance tests using JMeter on the moviedb API for the Get Popular Movie and Now Playing endpoints

The number of users is 100 and the distance between users is 0.5 seconds and the loop is 10x

## API Reference

#### Get all items

```http
  GET /3/movie/popular
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${page}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `page`      | `string` | **Required**. page  |

## Authors
- [@Ardiandwialfandi](https://www.github.com/Ardiandwialfandi)

## Screenshots

- #### Thread Group
![App Screenshot](https://snipboard.io/vunkPi.jpg)

- #### HTTP Request for Get Popular Movie
![App Screenshot](https://snipboard.io/7TblRB.jpg)

Enter the required parameters on the web being tested. starting from api key , language and page

![App Screenshot](https://snipboard.io/oIB9xt.jpg)

This is how i add also HTTP Header Manager and add element Content type of Headers

- #### HTTP Request for Get Now Playing
![App Screenshot](https://snipboard.io/MsrIj0.jpg)

Same as before, enter the required parameters on the web being tested. starting from api key , language and page And add also HTTP Header Manager and add element Content type of Headers

### Result Listener

- #### View Result tree
![App Screenshot](https://snipboard.io/JoYhDx.jpg)

- #### Graph Result
![App Screenshot](https://snipboard.io/qp3IDl.jpg)

- #### View Result in Table
![App Screenshot](https://snipboard.io/ZPi86b.jpg)

## Support

For support, email Dwiardian25@gmail.com 
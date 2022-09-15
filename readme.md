# **READ ME (MUSIC API):**

## **Who we are:**
![Alt](/logo.png "Logo")
**This isn’t just a Spotify clone, this is a BNTA Spotify clone.**

## **Project Overview:**
We are the team behind the MusicAPI. 4 members of Cohort 6 from the Bright Network Technology Academy!

* Faizan Khan
  * [Github](https://github.com/faizanahmkhan)
  * [LinkedIn](https://www.linkedin.com/in/fkhan38/)

* Hasmeet Kaur
  * [Github](https://github.com/HasmeetKaur)
  * [LinkedIn](https://www.linkedin.com/in/hasmeet-k-30680759/)

* Milo Curran
  * [Github](https://github.com/Obilisk-audio)
  * [LinkedIn](https://www.linkedin.com/in/milo-curran96)

* Joao Pedro Canale Pulsz
  * [Github](https://github.com/joaopulsz)
  * [LinkedIn](https://www.linkedin.com/in/joao-pedro-canale-pulsz/)

## **Project Overview**
As part of the Bright Network Technology Academy, we were assigned a group project to research, plan and develop an API in less than a week. As a group, we wanted to create an API which we would want to use personally.

## **This API features:**
- One-to-Many and Many-to-Many relationships
- Derived queries and queries for multiple endpoints
- Full CRUD functionality

## **Table of Contents:**
* [Setup and Instructions](/#Setup#and-Instructions-for-using-the-Project:)
* [Project Structure](/#Project-Structure:)
* [UML](/#Unified-Modelling-Language-Diagrams-(UML):)
* [ERD](/#Setup-and-Instructions-for-using-the-Project:)
* [Minimum Viable Product (MVP)](/#MVP:)
* [Extensions](/#Extension:)
* [Plain Old Java Objects (POJOs)](/#Plain-Old-Java-Objects-(POJOs):)
* [Running the API - List of Possible Commands (CRUD Functionality)](/#Running-the-API---List-of-Possible-Commands-(CRUD-Functionality):)
* [Testing](/#Testing:)
* [Further Implementations & Extensions](/#Further-Implementations-&-Extensions:)
* [Acknowledgements](/#Acknowledgments:)

## **Setup and Instructions for using the Project: {1}**
1. Make sure that you have Java 17 installed to run BeatzNTA API
2. Clone this repository by typing the following command into your terminal:
   git clone git@github.com:HasmeetKaur/music-api.git
3. You can access the endpoints via an API platform such as Postman or through the browser at https://localhost:8080/{endpoint}

## **Project Structure:**

## **Unified Modelling Language Diagrams (UML):**
![Alt](/UML_diagram.png "Logo")

## **Entity Relationship Diagrams (ERD):**
![Alt](/ERD_Diagram.png "Logo")

## **MVP:**
For our MVP, we wanted to create an API with full CRUD functionality with 5x classes:

* User
* Playlist
* Artist
* Track
* Album

## **Extension:**

For our extension, we wanted to
* add a 'shuffle' button method to generate a randomised playlist.
* search tracks, albums, tracks

## **Plain Old Java Objects (POJOs):**
|   POJO   	| Type                                                                                                                                                                	| Input Structure                                                                                                                                                    	|
|:--------:	|---------------------------------------------------------------------------------------------------------------------------------------------------------------------	|--------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| Track    	| String name;<br>Artist artist;<br>Genre genre (Enum);<br>double length;                                                                                             	| {<br>"name": "",<br>"artist": {    <br>     "id": Long,<br>     "name": "",<br>     "genre": ""<br>           },<br>"genre": "",<br>"length": double<br>}          	|
| Album    	| String name;<br>Artist artist;<br>int year;<br>Genre genre(Enum);<br>ArrayList<Track> tracks;                                                                       	| {<br>"name": "",<br>"artist": {<br>     "id": Long,<br>     "name": "",<br>     "genre": ""<br>           },<br>"year": int,<br>"genre": "",<br>"tracks": [ ]<br>} 	|
| Artist   	| String name;<br>Genre genre (Enum);<br>ArrayList<Album> albums;<br>ArrayList<Track> tracks;                                                                         	| {<br>"id": Long,        <br>"name": "",<br>"genre": "",<br>"albums": [ ],      <br>"tracks": [ ]<br>}                                                              	|
| Playlist 	| String name;<br>User user;<br>ArrayList<Track> tracks;                                                                                                              	| {<br>"id": Long,<br>"name": "",<br>"user": { },<br>"tracks": { }<br>}                                                                                              	|
| User     	| String userName; <br>ArrayList<Album> favouriteAlbums;<br>ArrayList<Album> favouriteAlbums;<br>ArrayList<Artist> favouriteTracks;<br>ArrayList<Playlist> playlists; 	| {<br>"userName": "",<br>"favouriteAlbums": [],<br>"favouriteArtists": [],<br>"favouriteTracks": [],<br>"playlists": []<br>}                                        	|

## **Running the API - List of Possible Commands (CRUD Functionality):**

localhost:8080/ ...

| HTTP Request Path                                                        | Request Type | Description                                      |
|:-------------------------------------------------------------------------|:-------------|:-------------------------------------------------|
| `…/albums ` | `GET` | Get All Albums Entries |
| `…/albums/{id} ` | `GET` | Get Albums by Id |
| `…/albums/track/{id} `| `GET`| Get Albums by Track Id |
| `…/albums/genre/{genre} ` | `GET` | Get Albums by Genre |
| `…/albums/artist/{id} ` | `GET` | Get Albums by Artist Id |
| `…/albums/favourites/{id} ` | `GET` | Get Favourite Albums by User Id |
| `…/albums/search/{name} ` | `GET` | Search Album by Name |
| `…/albums ` | `POST` | Save Album |
| `…/albums/{id} ` | `DELETE` | Remove Album by Id |
| `…/artists ` | `GET` | Get All Artist Entries |
| `…/artists/{id} ` | `GET` | Get Artists by Id |
| `…/artists/genre/{genre} ` | `GET` | Get Artists by Genre |
| `…/artists/favourites/{id} ` | `GET` | Get Favourite Artists by User Id |
| `…/artists/search/{name} ` | `GET` | Search Artists by Name |
| `…/artists ` | `POST` | Save Artist |
| `…/artists/{id} ` | `DELETE` | Remove Artist by Id |
| `…/tracks ` | `GET` | Get All Track Entries |
| `…/tracks/{id} ` | `GET` | Get Tracks by Id |
| `…/tracks/genre/{genre} ` | `GET` | Get Tracks by Genre |
| `…/tracks/artist/{id} ` | `GET` | Get Tracks by Artist Id |
| `…/tracks/favourites/{id} ` | `GET` | Get Favourite Tracks by User Id |
| `…/tracks/search/{name} ` | `GET` | Search Tracks by Name |
| `…/tracks ` | `POST` | Save Track |
| `…/tracks/{id} ` | `DELETE` | Remove Track by Id |
| `…/playlists ` | `GET` | Get All Playlists |
| `…/playlists/{userId} ` | `GET` | Get All Playlists by User Id |
| `…/playlists/shuffle/{id} ` | `GET` | Shuffle Playlist |
| `…/playlists/{playlistId}/tracks/{trackId} ` | `POST` | Add Track to Playlist by Id |
| `…/playlists/{userId}/{playlistName} ` | `POST` | Save Playlist |
| `…/playlists/{playlistId}/tracks/{trackId} ` | `DELETE` | Remove Track from Playlist by Id |
| `…/playlists/{id} ` | `DELETE` | Remove Playlist by Id |
| `…/users ` | `GET` | Get All Users |
| `…/users/{id} ` | `GET` | Get User by Id |
| `…/users/{userId}/favourites/tracks/{trackId} ` | `POST` | Add Track to Favourites by Id |
| `…/users/{userId}/favourites/albums/{albumId} ` | `POST` | Add Album to Favourites by Id |
| `…/users/{userId}/favourites/artists/{artistId} ` | `POST` | Add Artist to Favourites by Id |
| `…/users ` | `POST` | Save User |
| `…/users/{userId}/favourites/tracks/{trackId} ` | `DELETE` | Remove Track from Favourites by Id |
| `…/users/{userId}/favourites/albums/{albumId} ` | `DELETE` | Remove Album from Favourites by Id |
| `…/users/{userId}/favourites/artists/{artistId} ` | `DELETE` | Remove Artist from Favourites by Id |
| `…/users/{id} ` | `DELETE` | Remove User by Id |

## **Testing:**
Example of Postman testing:
Postman:

## **Further Implementations & Extensions:**

## **Acknowledgments:**
A special thank you to Iain, Zsolt, Anna, Colin, Richard, and Phil, for all the advice and support during the project.
You've made this learning process a blast!


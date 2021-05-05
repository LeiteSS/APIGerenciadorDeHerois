db = db.getSiblingDB('heroes_db');

db.heroes.insert(
    [
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa7"),
            "name": "Spider Man",
            "universe":"Marvel",
            "story": "A spider stung Peter Parker, then he becomes Spider Man",
            "city": "New York",
            "mainImageUrl": "https://psxbrasil.com.br/wp-content/uploads/2020/11/spider-8-4k.jpg",
            "authorName": "Stan Lee & Steve Ditko",
            "authorImageUrl": "https://kanto.legiaodosherois.com.br/w760-h398-gnw-cfill-q80/wp-content/uploads/2018/07/legiao_UQ0Hu7B81takLTE5C46lhwecFoRMVWAqXOiDdKJ9nr.jpg.jpeg"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa8"),
            "name": "Captain America",
            "universe":"Marvel",
            "story": "He is an American project to win the World War II",
            "city": "New York",
            "mainImageUrl": "https://cf-images.us-east-1.prod.boltdns.net/v1/static/5359769168001/0a823cb0-01a9-4835-a348-c64187783ccb/d37cb96c-805c-4aa2-9f2f-e62d9eb814c7/1280x720/match/image.jpg",
            "authorName": "Jack Kirby & Joe Simon",
            "authorImageUrl": "https://textocorridoblog.files.wordpress.com/2017/10/joe-simon-e-jack-kirby.jpg"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa9"),
            "name": "Hulk",
            "universe":"Marvel",
            "story": "He born after a accident involving radiation",
            "city": "New York",
            "mainImageUrl": "https://i.ytimg.com/vi/MAfIvBgChjQ/maxresdefault.jpg",
            "authorName": "Jack Kirby & Stan Lee",
            "authorImageUrl": "https://i2.wp.com/www.comicsbeat.com/wp-content/uploads/2018/11/stan-and-jack.jpg?fit=960%2C828&ssl=1"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa0"),
            "name": "Iron Man",
            "universe":"Marvel",
            "story": "Tony Stark developed a suit and become a hero",
            "city": "Los Angeles",
            "mainImageUrl": "https://uploads.jovemnerd.com.br/wp-content/uploads/2019/09/tony-star-iron-man-cancelada.jpg",
            "authorName": "Jack Kirby & Stan Lee",
            "authorImageUrl": "https://i2.wp.com/www.comicsbeat.com/wp-content/uploads/2018/11/stan-and-jack.jpg?fit=960%2C828&ssl=1"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aa10"),
            "name": "Batman",
            "universe":"Dc",
            "story": "After he saw his parents being assassinated he trained to protect his town",
            "city": "Gotham City",
            "mainImageUrl": "https://tecnoblog.net/wp-content/uploads/2021/04/Qual-a-ordem-cronologica-dos-filmes-do-Batman-Deny-Freeman-Flickr.jpg",
            "authorName": "Bob Kane",
            "authorImageUrl": "https://upload.wikimedia.org/wikipedia/commons/4/43/Bob_Kane_1966_photo.jpg"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aa11"),
            "name": "Super Man",
            "universe":"Dc",
            "story": "His planet was in war, then he parents send him to earth",
            "city": "Metropolis",
            "mainImageUrl": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJyWb7ITfm-vGZx0K2aRbQU-156tKWP1_e0w&usqp=CAU",
            "authorName": "Jerry Siegel, Wayne Boring, Joe Shuster",
            "authorImageUrl": "https://i.pinimg.com/originals/78/18/44/7818446e8dd5f176c79cfec2f05f7e5b.jpg"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa5"),
            "name": "Wonder Woman",
            "universe":"Dc",
            "story": "She is a amazonas' princess, but wants to protect earth",
            "city": "Metropolis",
            "mainImageUrl": "https://terraverso.com.br/wp-content/uploads/2020/12/Sensational-Wonder-Woman-Capa.jpg",
            "authorName": "William Moulton Marston",
            "authorImageUrl": "https://upload.wikimedia.org/wikipedia/commons/4/4f/William_Moulton_Marston_1938.jpg"
        },
        {
            "_id": ObjectId("5d0c18c190d2b33ae629aaa4"),
            "name": "Flash",
            "universe":"Dc",
            "story": "After a accident involving radiation he becomes the most fastest man on the earth",
            "city": "Central City",
            "mainImageUrl": "https://quadrinheiros.files.wordpress.com/2015/02/the_flash_tv_series_poster-6.jpg",
            "authorName": "Gardner Fox, Harry Lampert",
            "authorImageUrl": "http://pm1.narvii.com/7071/4809beeff56d274eebce5619800e9a3a353dd13fr1-400-300v2_00.jpg"
        }
    ]
);